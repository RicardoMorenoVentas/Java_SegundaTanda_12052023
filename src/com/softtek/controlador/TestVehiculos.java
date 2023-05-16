package com.softtek.controlador;

import com.softtek.modelo.vehiculos.Avion;
import com.softtek.modelo.vehiculos.Barco;
import com.softtek.modelo.vehiculos.Tren;
import com.softtek.modelo.vehiculos.Vehiculo;

import java.util.ArrayList;

public class TestVehiculos {
    public static void main(String[] args) {
        ArrayList<Vehiculo> arr_veh = new ArrayList<>();
        arr_veh.add(new Vehiculo(3000,"Rojo","Patata","Blanca"));
        arr_veh.add(new Avion(50000,"Airbus","AX356","Blanco","Airbus"));
        arr_veh.add(new Barco(200,"JetMax","G323","Rojo","Nudos"));
        arr_veh.add(new Tren(5000,"ILikeTrains","Train","Azul","B34"));

        for (Vehiculo veh: arr_veh ) {
            System.out.println(veh.obtenerDatos());
        }
    }
}
