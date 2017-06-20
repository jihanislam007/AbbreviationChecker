package md.mazharul.islam.jihan.abbreviationchecker;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;

public class MainActivity extends Activity implements SearchView.OnQueryTextListener
{
    private SearchView mSearchView;
    private ListView mListView;
    private ArrayList<Employee> employeeArrayList;
    private EmployeeAdapter employeeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSearchView=(SearchView) findViewById(R.id.searchView1);
        mListView=(ListView) findViewById(R.id.listView1);

        employeeArrayList=new ArrayList<Employee>();
        employeeArrayList.add(new Employee("AACI",   "Airport Association Council International"));
        employeeArrayList.add(new Employee("AAFI",   "Amateur Athletics Federation of India"));
        employeeArrayList.add(new Employee("AAGSP",  "All Assam Gana Sangram Parishad"));
        employeeArrayList.add(new Employee("AAPSO",  "Afro-Asian Peoples Solidarity Organisation"));
        employeeArrayList.add(new Employee("AASU",   "All Assam Students Union"));
        employeeArrayList.add(new Employee("ABM",    "Anti Ballistic Missile"));
        employeeArrayList.add(new Employee("ABCDE",  "Annual Bank Conference on Development Economics"));
        employeeArrayList.add(new Employee("ABSU",   "All Bodo Students Union"));
        employeeArrayList.add(new Employee("ABT",    "Availability Based Tariff"));
        employeeArrayList.add(new Employee("AC",     "Alternate Current or Ashok Chakra or Air Conditioner or Antarctic Club"));

        employeeAdapter=new EmployeeAdapter(MainActivity.this, employeeArrayList);
        mListView.setAdapter(employeeAdapter);

        mListView.setTextFilterEnabled(true);
        setupSearchView();


    }
    private void setupSearchView()
    {
        mSearchView.setIconifiedByDefault(false);
        mSearchView.setOnQueryTextListener(this);
     //   mSearchView.setSubmitButtonEnabled(true);
        mSearchView.setQueryHint("Search Here");
    }

    @Override
    public boolean onQueryTextChange(String newText)
    {

        if (TextUtils.isEmpty(newText)) {
            mListView.clearTextFilter();
        } else {
            mListView.setFilterText(newText);
        }
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query)
    {
        return false;
    }


}