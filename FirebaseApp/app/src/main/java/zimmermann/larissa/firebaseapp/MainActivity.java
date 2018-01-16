package zimmermann.larissa.firebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference firebaseReference = FirebaseDatabase.getInstance().getReference();
    private DatabaseReference usersReference = firebaseReference.child("users");
    private DatabaseReference productsReference = firebaseReference.child("products");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Product product = new Product();
        product.setColor("Red");
        product.setProducer("BMW");
        product.setDescription("Sports Car");*/
    }
}
