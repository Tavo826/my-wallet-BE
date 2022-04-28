--
-- Estructura de tabla para la tabla "wallets"
--

create TABLE WALLETS (
  "wallet_id" SERIAL NOT NULL,
  "user_id" VARCHAR(45) NOT NULL,
  "total" DECIMAL(15,2) NOT NULL,
  PRIMARY KEY ("wallet_id"));


--
-- Estructura de tabla para la tabla "reminders"
--

create TABLE REMINDERS (
  "reminder_id" SERIAL NOT NULL,
  "wallet_id" INT NOT NULL,
  "date" DATE NOT NULL,
  "remind" TIMESTAMP NOT NULL,
  "type" VARCHAR(10) NOT NULL,
  "quantity" DECIMAL(15,2) NOT NULL,
  "description" VARCHAR(255) NOT NULL,
  PRIMARY KEY ("reminder_id"),
  CONSTRAINT "fk_REMINDER_WALLETS1"
      FOREIGN KEY ("wallet_id")
      REFERENCES WALLETS ("wallet_id")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);

--
-- Estructura de tabla para la tabla "transactions"
--

create TABLE TRANSACTIONS (
  "transaction_id" SERIAL NOT NULL,
  "wallet_id" INT NOT NULL,
  "date" DATE NOT NULL,
  "type" VARCHAR(10) NOT NULL,
  "quantity" DECIMAL(15,2) NOT NULL,
  "description" VARCHAR(255) NOT NULL,
  PRIMARY KEY ("transaction_id"),
  CONSTRAINT "fk_TRANSACTIONS_WALLETS1"
      FOREIGN KEY ("wallet_id")
      REFERENCES WALLETS ("wallet_id")
      ON DELETE NO ACTION
      ON UPDATE NO ACTION);