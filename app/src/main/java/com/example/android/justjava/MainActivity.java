package com.example.android.justjava;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int quantity = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = quantity * 5;
        String priceMessage = "Total: $" + price;
        priceMessage = priceMessage + "\n" + "Thank you!";
         displayMessage(priceMessage);
    }

    /**
     * This method is called when the increment button is clicked.
     */
    public void Increment(View view){
       quantity++;
        display(quantity);

}
    /**
     * This method is called when the Decremment button is clicked.
     */
public void Decrement(View view){
        quantity--;
        display(quantity);
}
    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {

        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}