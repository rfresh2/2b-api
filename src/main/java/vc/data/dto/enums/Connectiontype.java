/*
 * This file is generated by jOOQ.
 */
package vc.data.dto.enums;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;
import vc.data.dto.Public;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum Connectiontype implements EnumType {

    JOIN("JOIN"),

    LEAVE("LEAVE");

    private final String literal;

    private Connectiontype(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public String getName() {
        return "connectiontype";
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal
     */
    public static Connectiontype lookupLiteral(String literal) {
        return EnumType.lookupLiteral(Connectiontype.class, literal);
    }
}