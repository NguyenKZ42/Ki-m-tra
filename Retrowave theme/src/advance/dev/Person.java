package advance.dev;

 class Person implements Comparable<Person>{
    private String job;
    private int age;
    private String city;
    private double income;

    public Person(String job, int age, String city, double income) {
        this.job = job;
        this.age = age;
        this.city = city;
        this.income = income;
    }

    // Getters and setters

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
    
    @Override
    public int compareTo(Person other) {
        return Double.compare(this.income, other.income);
    }


    @Override
    public String toString() {
        return job + ": " + age + ": " + city + ": " + income;
    }

}
