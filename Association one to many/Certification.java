class Certification {
    public String certificationBody;
    public String certificationID;
    public Appliance appliance;

    public Certification(String certificationBody, String certificationID, Appliance appliance) {
        this.certificationBody = certificationBody;
        this.certificationID = certificationID;
        this.appliance = appliance;
    }

    public void certificationDetails() {
        System.out.println("Certification Body: " + certificationBody);
        System.out.println("Certification ID: " + certificationID);
        System.out.println("Certified Appliance: " + appliance.applianceName);
    }
}