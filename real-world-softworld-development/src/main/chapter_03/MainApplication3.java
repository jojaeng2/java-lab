package main.chapter_03;

import main.chapter_02.BankStatementProcessor;
import main.chapter_02.BankTransaction;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class MainApplication3 {


    public static void main(String[] args) {
        final BankStatementProcessor bankStatementProcessor = new BankStatementProcessor(new ArrayList<>());

        final List<BankTransaction> transactions = bankStatementProcessor.findTransactions(new BankTransactionIsInFebruaryAndExpensive());

        final List<BankTransaction> transactions2 = bankStatementProcessor.findTransactions(bankTransaction ->
                bankTransaction.getDate().getMonth() == Month.FEBRUARY && bankTransaction.getAmount() >= 1000);

    }
}
