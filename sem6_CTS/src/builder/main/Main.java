package builder.main;

import builder.ContBancar;
import builder.ContBancarBuilder;
import builder.ContBuilder;
import builder.IBuilder;

public class Main {
    public static void main(String[] args) {

        IBuilder contBuilder=new ContBuilder();
        contBuilder.setNumeClient("Andreea").setCardAtasat(true);

        ContBancar contBancar=contBuilder.build();
        System.out.println(contBancar);

        ContBancar contBancar2=contBuilder.setNumeClient("Maria").setPrimesteSalariu(true).build();
        System.out.println(contBancar);
        System.out.println(contBancar2);

        IBuilder contBancarBuilder=new ContBancarBuilder();
        ContBancar cont = contBancarBuilder.setInternetBanking(true).setNumeClient("Carmen").build();
        ContBancar cont2 = contBancarBuilder.setCardAtasat(true).setNumeClient("Mariana").build();
        System.out.println(cont);
        System.out.println(cont2);

    }
}