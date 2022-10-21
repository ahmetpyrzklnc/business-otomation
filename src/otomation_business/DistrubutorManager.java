package otomation_business;

public class DistrubutorManager {

    private int distrubutor_id;
    private String distrubutor_name;
    private String distrubutor_city;
    private int distrubutor_gsm;

    public DistrubutorManager(int distrubutor_id, String distrubutor_name, String distrubutor_city, int distrubutor_gsm) {
        this.distrubutor_id = distrubutor_id;
        this.distrubutor_name = distrubutor_name;
        this.distrubutor_city = distrubutor_city;
        this.distrubutor_gsm = distrubutor_gsm;
    }

    public int getDistrubutor_id() {
        return distrubutor_id;
    }

    public void setDistrubutor_id(int distrubutor_id) {
        this.distrubutor_id = distrubutor_id;
    }

    public String getDistrubutor_name() {
        return distrubutor_name;
    }

    public void setDistrubutor_name(String distrubutor_name) {
        this.distrubutor_name = distrubutor_name;
    }

    public String getDistrubutor_city() {
        return distrubutor_city;
    }

    public void setDistrubutor_city(String distrubutor_city) {
        this.distrubutor_city = distrubutor_city;
    }

    public int getDistrubutor_gsm() {
        return distrubutor_gsm;
    }

    public void setDistrubutor_gsm(int distrubutor_gsm) {
        this.distrubutor_gsm = distrubutor_gsm;
    }
}
