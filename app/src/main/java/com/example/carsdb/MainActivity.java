package com.example.carsdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import Data.DatabaseHandler;
import Model.Car;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler databaseHandler = new DatabaseHandler(this);
        Log.d("CarsCount:", String.valueOf(databaseHandler.getCarsCount()));

//        databaseHandler.addCar(new Car("Toyota", "30 000 $"));
//        databaseHandler.addCar(new Car("Opel", "25 000 $"));
//        databaseHandler.addCar(new Car("Mercedes", "50 000 $"));
//        databaseHandler.addCar(new Car("KIA", "28 000 $"));
//        databaseHandler.addCar(new Car("Mazda", "30 000 $"));
//        databaseHandler.addCar(new Car("Honda", "25 000 $"));
//        databaseHandler.addCar(new Car("Skoda", "50 000 $"));
//        databaseHandler.addCar(new Car("Hundai", "28 000 $"));
//
//        Log.d("CarsCount:", String.valueOf(databaseHandler.getCarsCount()));
//
        List<Car> carList = databaseHandler.getAllCars();
//
//        /*Car deletingCar = databaseHandler.getCar(7);
//        databaseHandler.deleteCar(deletingCar);*/
//
        for (Car carr : carList) {
            Log.d("CarInfo:", "ID " + carr.getId() + ", name " + carr.getName() +
                    ", price " + carr.getPrice());
        }


        Car car = databaseHandler.getCar(6);
//        Log.d("CarInfo:", "ID " + car.getId() + ", name " + car.getName() +
//                    ", price " + car.getPrice());

        car.setName("ODA");
        car.setPrice("50 000 $");

        databaseHandler.updateCar(car);

        for (Car carr : carList) {
            Log.d("CarInfo:", "ID " + carr.getId() + ", name " + carr.getName() +
                    ", price " + carr.getPrice());
        }

    }
}