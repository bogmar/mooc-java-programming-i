
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void advance() {
        int sumOfDays = this.day + 1;
        if (sumOfDays > 30) {
            int sumOfMonths = this.month + (sumOfDays / 30);
            sumOfDays = sumOfDays - (sumOfMonths * 30);
            this.day = sumOfDays;
            if (sumOfMonths > 12) {
                int sumOfYears = sumOfMonths / 12;
                sumOfMonths = sumOfMonths - (sumOfYears * 12);
                this.month = sumOfMonths;
                this.year = sumOfYears;
            } else {
                this.month = sumOfMonths;
            }
        } else {
            this.day = sumOfDays;
        }
    }

    public void advance(int howManyDays) {
        for (int i = 0; i < howManyDays; i++) {
            advance();
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        int months = 0, years = 0;
        if (days > 30) {
            months = (days / 30);
            days = days - (months * 30);
            if (months > 12) {
                years = months / 12;
                months = months - (years * 12);
            }
        }
        
        SimpleDate newDate = new SimpleDate(days, months, years);
        
        return newDate;
    }
    
    /*public void advance(int howManyDays) {
        if (howManyDays > 0) {
            int sumOfDays = this.day + howManyDays;
            if (sumOfDays > 30) {
                int months = this.month + (sumOfDays / 30);
                sumOfDays = sumOfDays - (months * 30);
                this.day = sumOfDays;
                if (months > 12) {
                    int years = months / 12;
                    months = months - (years * 12);
                    this.month = months;
                    this.year = years;
                } else {
                    this.month = months;
                }
            } else {
                this.day = sumOfDays;
            }
        }
    }*/
    
    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
