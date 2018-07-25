package com.jasrin.contactbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imageView;
    TextView txtName,txtPhone,txtEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView=findViewById(R.id.imageview);

        txtName=findViewById(R.id.txt_name);
        txtPhone=findViewById(R.id.txt_phone);
        txtEmail=findViewById(R.id.txt_email);

        String getName=getIntent().getExtras().getString("name");

        if(getName.equals("Afsana")){
            imageView.setImageResource(R.drawable.name1);
            txtName.setText("Afsana");
            txtPhone.setText(R.string.phone_number1);
            txtEmail.setText(R.string.email_no1);

        }
        else if(getName.equals("Anika")){
            imageView.setImageResource(R.drawable.name2);
            txtName.setText("Anika");
            txtPhone.setText(R.string.phone_number2);
            txtEmail.setText(R.string.email_no2);

        }
        else if(getName.equals("Jasrin")){
            imageView.setImageResource(R.drawable.name3);
            txtName.setText("Jasrin");
            txtPhone.setText(R.string.phone_number3);
            txtEmail.setText(R.string.email_no3);

        }
        else if(getName.equals("Marjan")){
            imageView.setImageResource(R.drawable.name4);
            txtName.setText("Marjan");
            txtPhone.setText(R.string.phone_number4);
            txtEmail.setText(R.string.email_no4);

        }
        else if(getName.equals("Nadia")){
            imageView.setImageResource(R.drawable.name1);
            txtName.setText("Nadia");
            txtPhone.setText(R.string.phone_number5);
            txtEmail.setText(R.string.email_no5);

        }
        else if(getName.equals("Neepa")){
            imageView.setImageResource(R.drawable.name2);
            txtName.setText("Neepa");
            txtPhone.setText(R.string.phone_number6);
            txtEmail.setText(R.string.email_no6);

        }
        else if(getName.equals("Sumee")){
            imageView.setImageResource(R.drawable.name3);
            txtName.setText("Sumee");
            txtPhone.setText(R.string.phone_number7);
            txtEmail.setText(R.string.email_no7);

        }
        else if(getName.equals("Suhee")){
            imageView.setImageResource(R.drawable.name4);
            txtName.setText("Suhee");
            txtPhone.setText(R.string.phone_number8);
            txtEmail.setText(R.string.email_no8);

        }
        else if(getName.equals("Tasnim")){
            imageView.setImageResource(R.drawable.name1);
            txtName.setText("Tasnim");
            txtPhone.setText(R.string.phone_number9);
            txtEmail.setText(R.string.email_no9);

        }
        else if(getName.equals("Urbi")){
            imageView.setImageResource(R.drawable.name2);
            txtName.setText("Urbi");
            txtPhone.setText(R.string.phone_number10);
            txtEmail.setText(R.string.email_no10);

        }
        else if(getName.equals("Humi")){
            imageView.setImageResource(R.drawable.name3);
            txtName.setText("Humi");
            txtPhone.setText(R.string.phone_number11);
            txtEmail.setText(R.string.email_no11);

        }
        else if(getName.equals("Reshmi")){
            imageView.setImageResource(R.drawable.name4);
            txtName.setText("Reshmi");
            txtPhone.setText(R.string.phone_number12);
            txtEmail.setText(R.string.email_no12);

        }

    }


    }

