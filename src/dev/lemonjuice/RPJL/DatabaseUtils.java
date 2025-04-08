package dev.lemonjuice.RPJL;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtils {
    /**
     * Convert a ResultSet to a CachedRowSet.
     *
     * @param rs The ResultSet to convert.
     * @return The CachedRowSet.
     */
    public static CachedRowSet convertToCachedRowSet(ResultSet rs) {
        try {
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.populate(rs);
            return crs;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Convert a CachedRowSet to a ResultSet.
     *
     * @param crs The CachedRowSet to convert.
     * @return The ResultSet.
     */
    public static ResultSet convertToResultSet(CachedRowSet crs) {
        try {
            crs.beforeFirst();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return crs;
    }

    /**
     * Print the contents of a CachedRowSet.
     *
     * @param crs The CachedRowSet to print.
     */
    public static void printCachedRowSet(CachedRowSet crs) {
        try {
            while (crs.next()) {
                for (int i = 1; i <= crs.getMetaData().getColumnCount(); i++) {
                    System.out.print(crs.getString(i) + "\t");
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}