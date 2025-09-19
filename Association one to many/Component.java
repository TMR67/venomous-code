class Component {
    public String componentName;
    public String componentType;
    public Appliance appliance;

    public Component(String componentName, String componentType, Appliance appliance) {
        this.componentName = componentName;
        this.componentType = componentType;
        this.appliance = appliance;
    }

    public void componentDetails() {
        System.out.println("Component Name: " + componentName);
        System.out.println("Component Type: " + componentType);
        System.out.println("Part of Appliance: " + appliance.applianceName);
    }
}