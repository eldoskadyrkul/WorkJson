public class Workers {

    private int workerID;
    private String workerName;
    private String workerLastName;
    private int workerAge;

    public Workers(int workerID, String workerName, String workerLastName, int workerAge) {
        this.workerID = workerID;
        this.workerName = workerName;
        this.workerLastName = workerLastName;
        this.workerAge = workerAge;
    }

    @Override
    public String toString() {
        return "Workers{" +
                "workerID=" + workerID +
                ", workerName='" + workerName + '\'' +
                ", workerLastName='" + workerLastName + '\'' +
                ", workerAge=" + workerAge +
                '}';
    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerLastName() {
        return workerLastName;
    }

    public void setWorkerLastName(String workerLastName) {
        this.workerLastName = workerLastName;
    }

    public int getWorkerAge() {
        return workerAge;
    }

    public void setWorkerAge(int workerAge) {
        this.workerAge = workerAge;
    }
}