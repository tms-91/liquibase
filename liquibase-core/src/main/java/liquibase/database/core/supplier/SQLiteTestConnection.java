package liquibase.database.core.supplier;

import liquibase.database.Database;
import liquibase.database.core.SQLiteDatabase;
import liquibase.sdk.supplier.database.AbstractTestConnection;
import liquibase.sdk.supplier.database.JdbcTestConnection;

import java.util.Map;

public class SQLiteTestConnection extends JdbcTestConnection {
    @Override
    public boolean supports(Database database) {
        return database instanceof SQLiteDatabase;
    }

    @Override
    protected String getUrl() {
        return "jdbc:sqlite:sqlite/liquibase.db";
    }
}