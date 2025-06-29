CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from_acct IN NUMBER,
    p_to_acct IN NUMBER,
    p_amount IN NUMBER
) AS
    v_balance NUMBER;
BEGIN
    -- Lock source account row and fetch balance
    SELECT balance INTO v_balance 
    FROM Accounts 
    WHERE account_id = p_from_acct 
    FOR UPDATE;

    -- Check if sufficient balance
    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in source account.');
    END IF;

    -- Debit from source
    UPDATE Accounts
    SET balance = balance - p_amount
    WHERE account_id = p_from_acct;

    -- Credit to destination
    UPDATE Accounts
    SET balance = balance + p_amount
    WHERE account_id = p_to_acct;
END;
/
