
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
        return birdsPerDay;
    }

    public int getToday() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
        int today=birdsPerDay.length-1;
        System.out.println(birdsPerDay[today]=birdsPerDay[today]+1);
        
    }

    public boolean hasDayWithoutBirds() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
        for(int i:birdsPerDay){
            if(i==0)return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
        int sum=0;
        for(int i=0;i<birdsPerDay.length &&i<numberOfDays;i++){
            sum+=birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        // throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
        int ct=0;
        for(int i:birdsPerDay){
            if(i>=5)ct++;
        }
        return ct;
    }
}
