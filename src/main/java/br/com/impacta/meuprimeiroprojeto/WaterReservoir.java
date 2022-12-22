package br.com.impacta.meuprimeiroprojeto;

import java.util.Scanner;

public class WaterReservoir {

    public int TankSize(int height, int width, int length){
        return (height * width * length) / 10000;
    }

    public float DaysAutonomy(float TankCapacity, int consumption){
        return (TankCapacity / consumption)  / 31;
    }
    public String CheckConsumption(int TankCapacity, int consumption){


        float Autonomy = DaysAutonomy(TankCapacity, consumption);

        if (Autonomy < 3){
            return "High consumption.";
        }
        if(Autonomy >= 3 && Autonomy <= 8){
            return "Moderate consumption";
        }
        return "Reduced consumption";
    }

    public static void RunWaterReservoir() {
        WaterReservoir waterReservoir = new WaterReservoir();

        Scanner measurements = new Scanner(System.in);
        System.out.println("Enter the height value.");
        int height = measurements.nextInt();
        System.out.println("Enter the width value.");
        int width = measurements.nextInt();
        System.out.println("Enter the length value.");
        int length = measurements.nextInt();

        System.out.println("Enter the daily consumption.");
        int consumption = measurements.nextInt();

        int TankCapacity = waterReservoir.TankSize(height, width, length);
        System.out.println("The tank capacity is: "+TankCapacity+" liters.");

        String Consumption = waterReservoir.CheckConsumption(TankCapacity, consumption);
        System.out.println(Consumption);
    }

}
