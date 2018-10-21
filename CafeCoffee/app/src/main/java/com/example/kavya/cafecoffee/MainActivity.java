package com.example.kavya.cafecoffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

 private static final Integer PRICE_OF_EACH_COFFEE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        Button plusBtn = (Button) findViewById(R.id.plusBtn);
        Button resetBtn = (Button) findViewById(R.id.resetBtn);

    }


    public void subtractCoffee(View view) {
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);


        if(countValue !=0) {
            countValue = countValue - 1;
            totalPriceValue = totalPriceValue - PRICE_OF_EACH_COFFEE;

            count.setText(countValue.toString());
            totalPrice.setText(totalPriceValue.toString());
        }

        else{

            Toast toast = Toast.makeTest(this, "sorry! The coffee order is empty",Toast.LENGTH_SHORT);
            Toast.show();
        }

    }

    public void addCoffee(View view){
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);

        countValue = countValue + 1;
        totalPriceValue = totalPriceValue + PRICE_OF_EACH_COFFEE;


        count.setText(countValue.toString());
        totalPrice.setText(totalPriceValue.toString());

    }
   public void resetBtn(View view){

       TextView count = (TextView) findViewById(R.id.count);
       TextView price = (TextView) findViewById(R.id.price);


       count.setText("0");
       totalPrice.setText("0");


   }
    private static final Integer PRICE_OF_EACH_COFFEE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        Button plusBtn = (Button) findViewById(R.id.plusBtn);
        Button resetBtn = (Button) findViewById(R.id.resetBtn);

    }


    public void subtractCoffee(View view) {
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);


        if(countValue !=0) {
            countValue = countValue - 1;
            totalPriceValue = totalPriceValue - PRICE_OF_EACH_COFFEE;

            count.setText(countValue.toString());
            totalPrice.setText(totalPriceValue.toString());
        }

        else{

            Toast toast = Toast.makeTest(this, "sorry! The coffee order is empty",Toast.LENGTH_SHORT);
            Toast.show();
        }

    }

    public void addCoffee(View view){
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);

        countValue = countValue + 1;
        totalPriceValue = totalPriceValue + PRICE_OF_EACH_COFFEE;


        count.setText(countValue.toString());
        totalPrice.setText(totalPriceValue.toString());

    }
    public void resetBtn(View view){

        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);


        count.setText("0");
        totalPrice.setText("0");


    }




}private static final Integer PRICE_OF_EACH_COFFEE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        Button plusBtn = (Button) findViewById(R.id.plusBtn);
        Button resetBtn = (Button) findViewById(R.id.resetBtn);

    }


    public void subtractCoffee(View view) {
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);


        if(countValue !=0) {
            countValue = countValue - 1;
            totalPriceValue = totalPriceValue - PRICE_OF_EACH_COFFEE;

            count.setText(countValue.toString());
            totalPrice.setText(totalPriceValue.toString());
        }

        else{

            Toast toast = Toast.makeTest(this, "sorry! The coffee order is empty",Toast.LENGTH_SHORT);
            Toast.show();
        }

    }

    public void addCoffee(View view){
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);

        countValue = countValue + 1;
        totalPriceValue = totalPriceValue + PRICE_OF_EACH_COFFEE;


        count.setText(countValue.toString());
        totalPrice.setText(totalPriceValue.toString());

    }
    public void resetBtn(View view){

        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);


        count.setText("0");
        totalPrice.setText("0");


    }
    private static final Integer PRICE_OF_EACH_COFFEE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        Button plusBtn = (Button) findViewById(R.id.plusBtn);
        Button resetBtn = (Button) findViewById(R.id.resetBtn);

    }


    public void subtractCoffee(View view) {
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);


        if(countValue !=0) {
            countValue = countValue - 1;
            totalPriceValue = totalPriceValue - PRICE_OF_EACH_COFFEE;

            count.setText(countValue.toString());
            totalPrice.setText(totalPriceValue.toString());
        }

        else{

            Toast toast = Toast.makeTest(this, "sorry! The coffee order is empty",Toast.LENGTH_SHORT);
            Toast.show();
        }

    }

    public void addCoffee(View view){
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);

        countValue = countValue + 1;
        totalPriceValue = totalPriceValue + PRICE_OF_EACH_COFFEE;


        count.setText(countValue.toString());
        totalPrice.setText(totalPriceValue.toString());

    }
    public void resetBtn(View view){

        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);


        count.setText("0");
        totalPrice.setText("0");


    }
    private static final Integer PRICE_OF_EACH_COFFEE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        Button plusBtn = (Button) findViewById(R.id.plusBtn);
        Button resetBtn = (Button) findViewById(R.id.resetBtn);

    }


    public void subtractCoffee(View view) {
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);


        if(countValue !=0) {
            countValue = countValue - 1;
            totalPriceValue = totalPriceValue - PRICE_OF_EACH_COFFEE;

            count.setText(countValue.toString());
            totalPrice.setText(totalPriceValue.toString());
        }

        else{

            Toast toast = Toast.makeTest(this, "sorry! The coffee order is empty",Toast.LENGTH_SHORT);
            Toast.show();
        }

    }

    public void addCoffee(View view){
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);

        countValue = countValue + 1;
        totalPriceValue = totalPriceValue + PRICE_OF_EACH_COFFEE;


        count.setText(countValue.toString());
        totalPrice.setText(totalPriceValue.toString());

    }
    public void resetBtn(View view){

        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);


        count.setText("0");
        totalPrice.setText("0");


    }
    private static final Integer PRICE_OF_EACH_COFFEE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        Button plusBtn = (Button) findViewById(R.id.plusBtn);
        Button resetBtn = (Button) findViewById(R.id.resetBtn);

    }


    public void subtractCoffee(View view) {
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);


        if(countValue !=0) {
            countValue = countValue - 1;
            totalPriceValue = totalPriceValue - PRICE_OF_EACH_COFFEE;

            count.setText(countValue.toString());
            totalPrice.setText(totalPriceValue.toString());
        }

        else{

            Toast toast = Toast.makeTest(this, "sorry! The coffee order is empty",Toast.LENGTH_SHORT);
            Toast.show();
        }

    }

    public void addCoffee(View view){
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);

        countValue = countValue + 1;
        totalPriceValue = totalPriceValue + PRICE_OF_EACH_COFFEE;


        count.setText(countValue.toString());
        totalPrice.setText(totalPriceValue.toString());

    }
    public void resetBtn(View view){

        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);


        count.setText("0");
        totalPrice.setText("0");


    }
    private static final Integer PRICE_OF_EACH_COFFEE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        Button plusBtn = (Button) findViewById(R.id.plusBtn);
        Button resetBtn = (Button) findViewById(R.id.resetBtn);

    }


    public void subtractCoffee(View view) {
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);


        if(countValue !=0) {
            countValue = countValue - 1;
            totalPriceValue = totalPriceValue - PRICE_OF_EACH_COFFEE;

            count.setText(countValue.toString());
            totalPrice.setText(totalPriceValue.toString());
        }

        else{

            Toast toast = Toast.makeTest(this, "sorry! The coffee order is empty",Toast.LENGTH_SHORT);
            Toast.show();
        }

    }

    public void addCoffee(View view){
        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);

        String countText = count.getText().toString();
        Integer countView = Integer,parseInt(countText);

        String totalPriceText = count.getText().toString();
        Integer totalPriceValue = Integer.parseInt(totalPriceText);

        countValue = countValue + 1;
        totalPriceValue = totalPriceValue + PRICE_OF_EACH_COFFEE;


        count.setText(countValue.toString());
        totalPrice.setText(totalPriceValue.toString());

    }
    public void resetBtn(View view){

        TextView count = (TextView) findViewById(R.id.count);
        TextView price = (TextView) findViewById(R.id.price);


        count.setText("0");
        totalPrice.setText("0");


    }
