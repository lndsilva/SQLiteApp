package br.com.local.sqliteapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    private static final String NOME_DB = "devolvame.db";
    private static final int VERSAO_DB = 1;
    private static final String TABLE = "CREATE TABLE tbUsuario(codigo INTEGER PRIMARY KEY,nome TEXT,senha TEXT)";

    //Criando o banco de dados
    public DBHelper(@Nullable Context context) {
        super(context, NOME_DB, null, VERSAO_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //criar o banco de dados
        db.execSQL(TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //criar a estrutura para alterar o banco de dados
    }
}
