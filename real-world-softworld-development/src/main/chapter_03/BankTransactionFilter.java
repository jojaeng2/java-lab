package main.chapter_03;

import main.chapter_02.BankTransaction;

@FunctionalInterface
public interface BankTransactionFilter {

    boolean test(BankTransaction bankTransaction);
}
