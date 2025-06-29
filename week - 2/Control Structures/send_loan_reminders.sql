DECLARE
   CURSOR loan_cur IS
      SELECT CustomerID, LoanDueDate
      FROM Loans
      WHERE LoanDueDate <= SYSDATE + 30;

BEGIN
   FOR rec IN loan_cur LOOP
      DBMS_OUTPUT.PUT_LINE('Reminder: Loan for Customer ID ' || rec.CustomerID ||
                           ' is due on ' || TO_CHAR(rec.LoanDueDate, 'DD-MON-YYYY'));
   END LOOP;
END;
/
