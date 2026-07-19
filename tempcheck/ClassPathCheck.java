package tempcheck;
public class ClassPathCheck {
    public static void main(String[] args) {
        printLocation("ASimulatorSystem.Deposit", ASimulatorSystem.Deposit.class);
        printLocation("ASimulatorSystem.MiniStatement", ASimulatorSystem.MiniStatement.class);
        printLocation("ASimulatorSystem.Withdrawl", ASimulatorSystem.Withdrawl.class);
    }
    private static void printLocation(String name, Class<?> cls) {
        System.out.println(name + ":");
        System.out.println("  codeSource=" + (cls.getProtectionDomain().getCodeSource()==null ? "null" : cls.getProtectionDomain().getCodeSource().getLocation()));
        System.out.println("  resource=" + cls.getResource(cls.getSimpleName() + ".class"));
    }
}
