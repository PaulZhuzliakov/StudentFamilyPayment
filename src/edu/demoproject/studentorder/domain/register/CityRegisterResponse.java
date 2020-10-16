package edu.demoproject.studentorder.domain.register;

//ответ ГРН на запрос об одной персоне
public class CityRegisterResponse {
    private boolean existing;
    //временная прописка(true или false). null - если человека нет, то и прописки быть не может
    private Boolean temporal;



    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }

    @Override
    public String toString() {
        return "CityRegisterCheckResponse{" +
                "existing=" + existing +
                ", temporal=" + temporal +
                '}';
    }
}
