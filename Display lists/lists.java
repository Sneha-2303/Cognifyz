package com.example.lists;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.lists.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> itemList;
    private ArrayAdapter<String> adapter;
    private ListView listView;
    private EditText editTextItem;
    private Button buttonAdd;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        listView = findViewById(R.id.listView);
        editTextItem = findViewById(R.id.editTextItem);
        buttonAdd = findViewById(R.id.buttonAdd);

        // Initialize the list
        itemList = new ArrayList<>();
        itemList.add("Computer Languages List");

        // Initialize adapter
        adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, itemList);
        listView.setAdapter(adapter);

        // Set click listener for add button
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addItemToList();
            }
        });
    }

    private void addItemToList() {
        String newItem = editTextItem.getText().toString().trim();

        if (!newItem.isEmpty()) {
            // Add the new item to the list
            itemList.add(newItem);

            // Notify the adapter that data has changed
            adapter.notifyDataSetChanged();

            // Clear the input field
            editTextItem.setText("");

            // Scroll to the bottom of the list
            listView.smoothScrollToPosition(itemList.size() - 1);
        } else {
            Toast.makeText(this, "Please enter an item", Toast.LENGTH_SHORT).show();
        }
    }
}
