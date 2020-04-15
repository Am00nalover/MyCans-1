package com.app.mycan1;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.app.mycan1.model.Invoice;
import com.app.mycan1.model.InvoiceItem;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EnterReceiptIdActivity extends AppCompatActivity {

    Context ctx;

    EditText receiptIdTV;
    Button next_btn, fill_btn;
    ProgressDialog dialog;

    FirebaseDatabase mDatabase;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt_id);

        ctx = this;
        dialog = new ProgressDialog(ctx);
        dialog.setCancelable(false);

        receiptIdTV = findViewById(R.id.receiptIdTV);
        next_btn = findViewById(R.id.next_btn);
        fill_btn = findViewById(R.id.fill_btn);

        mDatabase = FirebaseDatabase.getInstance();



        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String receiptId = receiptIdTV.getText().toString().trim();
                if(receiptId.isEmpty()){
                    showToast("Enter receipt ID");
                    return;
                }

                Intent i = new Intent(ctx, InvoiceItemsListActivity.class);
                i.putExtra("receiptId", receiptId);
                startActivity(i);


            }
        });

        fill_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addInvoices();
            }
        });
    }

    void showToast(String m){
        Toast.makeText(ctx, m, Toast.LENGTH_SHORT).show();
    }


    void addInvoices(){

        InvoiceItem item1 = new InvoiceItem(1, "Nescafe classic", "7891000085387", 3);
        InvoiceItem item2 = new InvoiceItem(2, "HANAA whole oats", "6281055000298", 4);
        InvoiceItem item3 = new InvoiceItem(3, "Vanilla foodland", "12991174", 5);
        InvoiceItem item4 = new InvoiceItem(4, "Alalali corn flour", "617950200543", 2);
        InvoiceItem item5 = new InvoiceItem(5, "Luna caramel", "6281020172418", 4);
        InvoiceItem item6 = new InvoiceItem(6, "Indofood sweet soy sauce", "89686420036", 2);
        InvoiceItem item7 = new InvoiceItem(7, "Panda Sterilized cream", "6281174017351", 3);
        InvoiceItem item8 = new InvoiceItem(8, "Food makers Cocoa", "6287001980560", 6);
        InvoiceItem item9 = new InvoiceItem(9, "Treva light meat tuna", "6281014300018", 6);
        InvoiceItem item10 = new InvoiceItem(10, "Aba-alkhail qassim mixed coffee", "6281103300028", 2);
        InvoiceItem item11 = new InvoiceItem(11, "Indomi cary flavour", "89686122138", 9);
        InvoiceItem item12 = new InvoiceItem(12, "Oreo original", "7622210642301", 12);
        InvoiceItem item13 = new InvoiceItem(13, "Perfetto nocciole", "6281014402101", 7);
        InvoiceItem item14 = new InvoiceItem(14, "Lipton yellow label", "6281006856370", 6);
        InvoiceItem item15 = new InvoiceItem(15, "Luna evaporated milk", "6281020050211", 2);
        InvoiceItem item16 = new InvoiceItem(16, "Wadi fatma concentrated milk", "6281100113058", 5);
        InvoiceItem item17 = new InvoiceItem(17, "Lay's chili", "6281036110206", 3);
        InvoiceItem item18 = new InvoiceItem(18, "Almarai fresh laban", "6281007023122", 2);
        InvoiceItem item19 = new InvoiceItem(19, "White bread", "6249332646430", 2);
        InvoiceItem item20 = new InvoiceItem(20, "7days swiss roll", "6281183000290", 5);
        InvoiceItem item21 = new InvoiceItem(21, "Galaxi caramel", "6294001810490", 2);
        InvoiceItem item22 = new InvoiceItem(22, "Almarai fresh yoghurt", "6281007040655", 8);
        InvoiceItem item23 = new InvoiceItem(23, "Almarai cheese slice burger", "6281007169004", 4);
        InvoiceItem item24 = new InvoiceItem(24, "Rana hot sauce", "02412913", 2);
        InvoiceItem item25 = new InvoiceItem(25, "Almarai milk", "6281007032261", 6);
        InvoiceItem item26 = new InvoiceItem(26, "Lux", "6281006141209", 5);
        InvoiceItem item27 = new InvoiceItem(27, "Puck cream cheese", "5760466738040", 4);
        InvoiceItem item28 = new InvoiceItem(28, "Halawani tahina", "6281041029012", 2);
        InvoiceItem item29 = new InvoiceItem(29, "Mayonnaise goody", "6281014111003", 3);
        InvoiceItem item30 = new InvoiceItem(30, "Goody natural vinegar", "6281014190107", 4);
        InvoiceItem item31 = new InvoiceItem(31, "Tomato ketchup", "6294003548353", 14);


        List<InvoiceItem> items1 = new ArrayList<>();
        items1.add(item1);
        items1.add(item5);
        items1.add(item16);
        items1.add(item26);
        Invoice invoice1 = new Invoice();
        invoice1.setReceiptId("985205");
        invoice1.setItems(items1);


        List<InvoiceItem> items2 = new ArrayList<>();
        items2.add(item2);
        items2.add(item8);
        items2.add(item12);
        items2.add(item22);
        items2.add(item23);
        Invoice invoice2 = new Invoice();
        invoice2.setReceiptId("724835");
        invoice2.setItems(items2);


        List<InvoiceItem> items3 = new ArrayList<>();
        items3.add(item3);
        items3.add(item6);
        Invoice invoice3 = new Invoice();
        invoice3.setReceiptId("753792");
        invoice3.setItems(items3);


        List<InvoiceItem> items4 = new ArrayList<>();
        items4.add(item4);
        items4.add(item7);
        items4.add(item9);
        items4.add(item10);
        Invoice invoice4 = new Invoice();
        invoice4.setReceiptId("375836");
        invoice4.setItems(items4);


        List<InvoiceItem> items5 = new ArrayList<>();
        items5.add(item11);
        items5.add(item13);
        items5.add(item14);
        items5.add(item15);
        Invoice invoice5 = new Invoice();
        invoice5.setReceiptId("976512");
        invoice5.setItems(items5);


        List<InvoiceItem> items6 = new ArrayList<>();
        items6.add(item17);
        items6.add(item21);
        items6.add(item24);
        items6.add(item25);
        Invoice invoice6 = new Invoice();
        invoice6.setReceiptId("552792");
        invoice6.setItems(items6);


        List<InvoiceItem> items7 = new ArrayList<>();
        items7.add(item18);
        items7.add(item29);
        items7.add(item31);
        Invoice invoice7 = new Invoice();
        invoice7.setReceiptId("437933");
        invoice7.setItems(items7);


        List<InvoiceItem> items8 = new ArrayList<>();
        items8.add(item19);
        items8.add(item20);
        items8.add(item27);
        items8.add(item28);
        items8.add(item30);
        Invoice invoice8 = new Invoice();
        invoice8.setReceiptId("365488");
        invoice8.setItems(items8);




        mDatabase.getReference("invoices").push().setValue(invoice1);
        mDatabase.getReference("invoices").push().setValue(invoice2);
        mDatabase.getReference("invoices").push().setValue(invoice3);
        mDatabase.getReference("invoices").push().setValue(invoice4);
        mDatabase.getReference("invoices").push().setValue(invoice5);
        mDatabase.getReference("invoices").push().setValue(invoice6);
        mDatabase.getReference("invoices").push().setValue(invoice7);
        mDatabase.getReference("invoices").push().setValue(invoice8);
    }
}
