package ru.unn.agile.PrimeNumber.ViewModel;

enum Status {
    WAITING("Please provide input data"),
    READY("Press 'Find' or Enter to find prime numbers"),
    BAD_FORMAT("Bad format"),
    SUCCESS("Success");

    private final String name;
    Status(final String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

