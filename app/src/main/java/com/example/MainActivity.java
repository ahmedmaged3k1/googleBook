package com.example.google_books;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.google_books.Adapter.Book_Adapter;
import com.example.google_books.Books.Books;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView Booksview;
    private ArrayList<Books> books =new ArrayList<Books>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Booksview=findViewById(R.id.Books_Recycler);

        Book_Adapter book_adapter = new Book_Adapter(this);
        book_adapter.setBooks(books);
        Booksview.setAdapter(book_adapter);
        Booksview.setLayoutManager(new LinearLayoutManager(this));
        Booksview.setHasFixedSize(true);
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {

                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                int index = viewHolder.getAdapterPosition();
                Toast.makeText(getBaseContext(),books.get(index).getBook_name()+" Deleted",Toast.LENGTH_SHORT).show();
                books.remove(viewHolder.getAdapterPosition());

                book_adapter.notifyDataSetChanged();




            }
        }).attachToRecyclerView(Booksview);
        add_books();
    }
    private void add_books(){
        books.add(new Books("C++ For Begginers","Oliver Smith",R.drawable.c,"520","7","Python is an interpreted, high-level and general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.[27]\n" +
                "\n" +
                "Python is dynamically typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented and functional programming. Python is often described as a \"batteries included\" language due to its comprehensive standard library.[28]\n" +
                "\n" +
                "Python was created in the late 1980s, and first released in 1991, by Guido van Rossum as a successor to the ABC programming language. Python 2.0, released in 2000, introduced new features, such as list comprehensions, and a garbage collection system with reference counting, and was discontinued with version 2.7 in 2020.[29] Python 3.0, released in 2008, was a major revision of the language that is not completely backward-compatible and much Python 2 code does not run unmodified on Python 3. With Python 2's end-of-life, only Python 3.6.x[30] and later are supported, with older versions still supporting e.g. Windows 7 (and old installers not restricted to 64-bit Windows).\n" +
                "\n" +
                "Python interpreters are supported for mainstream operating systems and available for a few more (and in the past supported many more). A global community of programmers develops and maintains CPython, a free and open-source[31] reference implementation. A non-profit organization, the Python Software Foundation, manages and directs resources for Python and CPython development.\n" +
                "\n" +
                "As of December 2020 Python ranked third in TIOBE’s index of most popular programming languages, behind C and Java.[32] "));
        books.add(new Books("Data Structures","Tony Sam",R.drawable.ds,"740","55","Python is an interpreted, high-level and general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.[27]\n" +
                "\n" +
                "Python is dynamically typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented and functional programming. Python is often described as a \"batteries included\" language due to its comprehensive standard library.[28]\n" +
                "\n" +
                "Python was created in the late 1980s, and first released in 1991, by Guido van Rossum as a successor to the ABC programming language. Python 2.0, released in 2000, introduced new features, such as list comprehensions, and a garbage collection system with reference counting, and was discontinued with version 2.7 in 2020.[29] Python 3.0, released in 2008, was a major revision of the language that is not completely backward-compatible and much Python 2 code does not run unmodified on Python 3. With Python 2's end-of-life, only Python 3.6.x[30] and later are supported, with older versions still supporting e.g. Windows 7 (and old installers not restricted to 64-bit Windows).\n" +
                "\n" +
                "Python interpreters are supported for mainstream operating systems and available for a few more (and in the past supported many more). A global community of programmers develops and maintains CPython, a free and open-source[31] reference implementation. A non-profit organization, the Python Software Foundation, manages and directs resources for Python and CPython development.\n" +
                "\n" +
                "As of December 2020 Python ranked third in TIOBE’s index of most popular programming languages, behind C and Java.[32] "));
        books.add(new Books("Python","Will Rooney",R.drawable.programing_crystal,"685","14","Python is an interpreted, high-level and general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.[27]\n" +
                "\n" +
                "Python is dynamically typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented and functional programming. Python is often described as a \"batteries included\" language due to its comprehensive standard library.[28]\n" +
                "\n" +
                "Python was created in the late 1980s, and first released in 1991, by Guido van Rossum as a successor to the ABC programming language. Python 2.0, released in 2000, introduced new features, such as list comprehensions, and a garbage collection system with reference counting, and was discontinued with version 2.7 in 2020.[29] Python 3.0, released in 2008, was a major revision of the language that is not completely backward-compatible and much Python 2 code does not run unmodified on Python 3. With Python 2's end-of-life, only Python 3.6.x[30] and later are supported, with older versions still supporting e.g. Windows 7 (and old installers not restricted to 64-bit Windows).\n" +
                "\n" +
                "Python interpreters are supported for mainstream operating systems and available for a few more (and in the past supported many more). A global community of programmers develops and maintains CPython, a free and open-source[31] reference implementation. A non-profit organization, the Python Software Foundation, manages and directs resources for Python and CPython development.\n" +
                "\n" +
                "As of December 2020 Python ranked third in TIOBE’s index of most popular programming languages, behind C and Java.[32] "));
        books.add(new Books("Node.Js Guide","Adama Adams",R.drawable.node_js,"220","14","Python is an interpreted, high-level and general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.[27]\n" +
                "\n" +
                "Python is dynamically typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented and functional programming. Python is often described as a \"batteries included\" language due to its comprehensive standard library.[28]\n" +
                "\n" +
                "Python was created in the late 1980s, and first released in 1991, by Guido van Rossum as a successor to the ABC programming language. Python 2.0, released in 2000, introduced new features, such as list comprehensions, and a garbage collection system with reference counting, and was discontinued with version 2.7 in 2020.[29] Python 3.0, released in 2008, was a major revision of the language that is not completely backward-compatible and much Python 2 code does not run unmodified on Python 3. With Python 2's end-of-life, only Python 3.6.x[30] and later are supported, with older versions still supporting e.g. Windows 7 (and old installers not restricted to 64-bit Windows).\n" +
                "\n" +
                "Python interpreters are supported for mainstream operating systems and available for a few more (and in the past supported many more). A global community of programmers develops and maintains CPython, a free and open-source[31] reference implementation. A non-profit organization, the Python Software Foundation, manages and directs resources for Python and CPython development.\n" +
                "\n" +
                "As of December 2020 Python ranked third in TIOBE’s index of most popular programming languages, behind C and Java.[32] "));
        books.add(new Books("Programing Crystal","Oliver Smith",R.drawable.programing_crystal,"1400","77","Python is an interpreted, high-level and general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.[27]\n" +
                "\n" +
                "Python is dynamically typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented and functional programming. Python is often described as a \"batteries included\" language due to its comprehensive standard library.[28]\n" +
                "\n" +
                "Python was created in the late 1980s, and first released in 1991, by Guido van Rossum as a successor to the ABC programming language. Python 2.0, released in 2000, introduced new features, such as list comprehensions, and a garbage collection system with reference counting, and was discontinued with version 2.7 in 2020.[29] Python 3.0, released in 2008, was a major revision of the language that is not completely backward-compatible and much Python 2 code does not run unmodified on Python 3. With Python 2's end-of-life, only Python 3.6.x[30] and later are supported, with older versions still supporting e.g. Windows 7 (and old installers not restricted to 64-bit Windows).\n" +
                "\n" +
                "Python interpreters are supported for mainstream operating systems and available for a few more (and in the past supported many more). A global community of programmers develops and maintains CPython, a free and open-source[31] reference implementation. A non-profit organization, the Python Software Foundation, manages and directs resources for Python and CPython development.\n" +
                "\n" +
                "As of December 2020 Python ranked third in TIOBE’s index of most popular programming languages, behind C and Java.[32] "));

        books.add(new Books("Programing","Oliver Smith",R.drawable.cp,"520","7","Python is an interpreted, high-level and general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.[27]\n" +
                "\n" +
                "Python is dynamically typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented and functional programming. Python is often described as a \"batteries included\" language due to its comprehensive standard library.[28]\n" +
                "\n" +
                "Python was created in the late 1980s, and first released in 1991, by Guido van Rossum as a successor to the ABC programming language. Python 2.0, released in 2000, introduced new features, such as list comprehensions, and a garbage collection system with reference counting, and was discontinued with version 2.7 in 2020.[29] Python 3.0, released in 2008, was a major revision of the language that is not completely backward-compatible and much Python 2 code does not run unmodified on Python 3. With Python 2's end-of-life, only Python 3.6.x[30] and later are supported, with older versions still supporting e.g. Windows 7 (and old installers not restricted to 64-bit Windows).\n" +
                "\n" +
                "Python interpreters are supported for mainstream operating systems and available for a few more (and in the past supported many more). A global community of programmers develops and maintains CPython, a free and open-source[31] reference implementation. A non-profit organization, the Python Software Foundation, manages and directs resources for Python and CPython development.\n" +
                "\n" +
                "As of December 2020 Python ranked third in TIOBE’s index of most popular programming languages, behind C and Java.[32] "));
        books.add(new Books("Intro Programing ","Oliver Smith",R.drawable.intro,"520","7","Python is an interpreted, high-level and general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.[27]\n" +
                "\n" +
                "Python is dynamically typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented and functional programming. Python is often described as a \"batteries included\" language due to its comprehensive standard library.[28]\n" +
                "\n" +
                "Python was created in the late 1980s, and first released in 1991, by Guido van Rossum as a successor to the ABC programming language. Python 2.0, released in 2000, introduced new features, such as list comprehensions, and a garbage collection system with reference counting, and was discontinued with version 2.7 in 2020.[29] Python 3.0, released in 2008, was a major revision of the language that is not completely backward-compatible and much Python 2 code does not run unmodified on Python 3. With Python 2's end-of-life, only Python 3.6.x[30] and later are supported, with older versions still supporting e.g. Windows 7 (and old installers not restricted to 64-bit Windows).\n" +
                "\n" +
                "Python interpreters are supported for mainstream operating systems and available for a few more (and in the past supported many more). A global community of programmers develops and maintains CPython, a free and open-source[31] reference implementation. A non-profit organization, the Python Software Foundation, manages and directs resources for Python and CPython development.\n" +
                "\n" +
                "As of December 2020 Python ranked third in TIOBE’s index of most popular programming languages, behind C and Java.[32] "));
        books.add(new Books("PHP Full Course","Oliver Smith",R.drawable.php,"520","7","Python is an interpreted, high-level and general-purpose programming language. Python's design philosophy emphasizes code readability with its notable use of significant whitespace. Its language constructs and object-oriented approach aim to help programmers write clear, logical code for small and large-scale projects.[27]\n" +
                "\n" +
                "Python is dynamically typed and garbage-collected. It supports multiple programming paradigms, including structured (particularly, procedural), object-oriented and functional programming. Python is often described as a \"batteries included\" language due to its comprehensive standard library.[28]\n" +
                "\n" +
                "Python was created in the late 1980s, and first released in 1991, by Guido van Rossum as a successor to the ABC programming language. Python 2.0, released in 2000, introduced new features, such as list comprehensions, and a garbage collection system with reference counting, and was discontinued with version 2.7 in 2020.[29] Python 3.0, released in 2008, was a major revision of the language that is not completely backward-compatible and much Python 2 code does not run unmodified on Python 3. With Python 2's end-of-life, only Python 3.6.x[30] and later are supported, with older versions still supporting e.g. Windows 7 (and old installers not restricted to 64-bit Windows).\n" +
                "\n" +
                "Python interpreters are supported for mainstream operating systems and available for a few more (and in the past supported many more). A global community of programmers develops and maintains CPython, a free and open-source[31] reference implementation. A non-profit organization, the Python Software Foundation, manages and directs resources for Python and CPython development.\n" +
                "\n" +
                "As of December 2020 Python ranked third in TIOBE’s index of most popular programming languages, behind C and Java.[32] "));
    }
}