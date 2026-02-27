class SRP {
    public static void main(String[] args) {
        Report r = new Report();
        r.generateReport();

        ReportRepository rr = new ReportRepository();
        rr.saveToDatabase();
    }

}

class Report {
    void generateReport() {
        System.out.println("Generating report");
    }
}

class ReportRepository {
    void saveToDatabase() {
        System.out.println("Saving to DB");
    }
}