CREATE TABLE
  exchange_value (
    id NUMBER(38, 0) GENERATED ALWAYS as IDENTITY(
      START
      with
        1 INCREMENT by 1
    ),
    currency_from VARCHAR2(15),
    currency_to VARCHAR2(15),
    conversion_multiple NUMBER DEFAULT 0,
    port NUMBER DEFAULT 0
  );

INSERT INTO exchange_value(currency_from,currency_to,conversion_multiple,port) VALUES('USD','INR',65,0);
INSERT INTO exchange_value(currency_from,currency_to,conversion_multiple,port) VALUES('EUR','INR',75,0);
INSERT INTO exchange_value(currency_from,currency_to,conversion_multiple,port) VALUES('AUD','INR',25,0);