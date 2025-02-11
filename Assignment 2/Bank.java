public class Bank {
    double amount=0;
    double[] interaction = {};
    public void deposit(double m) {
        amount+=m;
        double[] temp = new double[interaction.length+1];
        for(int i = 0; i < interaction.length; i++) {
            temp[i] = interaction[i];
        }
        temp[interaction.length] = m; 
        interaction = temp.clone();
    }
    public void withdraw(double m) {
        amount-=m;
        double[] temp = new double[interaction.length+1];
        for(int i = 0; i < interaction.length; i++) {
            temp[i] = interaction[i];
        }
        temp[interaction.length] = -m; 
        interaction = temp.clone();
    }
    public void listInteractions() {
        for(int i = 0; i < interaction.length; i++) {
            System.out.println(interaction[i]);
        }
    }
}