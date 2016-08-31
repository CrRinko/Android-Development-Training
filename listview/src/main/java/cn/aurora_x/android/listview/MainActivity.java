package cn.aurora_x.android.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] names=getResources().getStringArray(R.array.name_list);
        String[] classes=getResources().getStringArray(R.array.class_list);
        String[] ids=getResources().getStringArray(R.array.id_list);
        List<Map<String,String>> students=new ArrayList<Map<String,String>>();
        for(int i=0;i<names.length;i++){
            Map<String,String> student=new HashMap<String,String>();
            student.put("Name",names[i]);
            student.put("Class",classes[i]);
            student.put("ID",ids[i]);
            students.add(student);
        }
        SimpleAdapter adapter=new SimpleAdapter(this,students,R.layout.studentlist_item,new String[]{"Name","Class","ID"},new int[]{R.id.tv_name,R.id.tv_class,R.id.tv_id});
        ListView listView=(ListView)findViewById(R.id.lv_studentList);
        listView.setAdapter(adapter);
    }
}
