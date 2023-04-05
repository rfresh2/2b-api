/*
 * This file is generated by jOOQ.
 */
package vc.data.dto.tables;


import org.jooq.Record;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import vc.data.dto.Public;
import vc.data.dto.tables.records.QueuewaitRecord;

import java.time.OffsetDateTime;
import java.util.function.Function;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Queuewait extends TableImpl<QueuewaitRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.queuewait</code>
     */
    public static final Queuewait QUEUEWAIT = new Queuewait();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QueuewaitRecord> getRecordType() {
        return QueuewaitRecord.class;
    }

    /**
     * The column <code>public.queuewait.id</code>.
     */
    public final TableField<QueuewaitRecord, Integer> ID = createField(DSL.name("id"), SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.queuewait.player_name</code>.
     */
    public final TableField<QueuewaitRecord, String> PLAYER_NAME = createField(DSL.name("player_name"), SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.queuewait.prio</code>.
     */
    public final TableField<QueuewaitRecord, Boolean> PRIO = createField(DSL.name("prio"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>public.queuewait.start_queue_time</code>.
     */
    public final TableField<QueuewaitRecord, OffsetDateTime> START_QUEUE_TIME = createField(DSL.name("start_queue_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "");

    /**
     * The column <code>public.queuewait.end_queue_time</code>.
     */
    public final TableField<QueuewaitRecord, OffsetDateTime> END_QUEUE_TIME = createField(DSL.name("end_queue_time"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "");

    /**
     * The column <code>public.queuewait.queue_time</code>.
     */
    public final TableField<QueuewaitRecord, Long> QUEUE_TIME = createField(DSL.name("queue_time"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.queuewait.initial_queue_len</code>.
     */
    public final TableField<QueuewaitRecord, Integer> INITIAL_QUEUE_LEN = createField(DSL.name("initial_queue_len"), SQLDataType.INTEGER.nullable(false), this, "");

    private Queuewait(Name alias, Table<QueuewaitRecord> aliased) {
        this(alias, aliased, null);
    }

    private Queuewait(Name alias, Table<QueuewaitRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.queuewait</code> table reference
     */
    public Queuewait(String alias) {
        this(DSL.name(alias), QUEUEWAIT);
    }

    /**
     * Create an aliased <code>public.queuewait</code> table reference
     */
    public Queuewait(Name alias) {
        this(alias, QUEUEWAIT);
    }

    /**
     * Create a <code>public.queuewait</code> table reference
     */
    public Queuewait() {
        this(DSL.name("queuewait"), null);
    }

    public <O extends Record> Queuewait(Table<O> child, ForeignKey<O, QueuewaitRecord> key) {
        super(child, key, QUEUEWAIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Identity<QueuewaitRecord, Integer> getIdentity() {
        return (Identity<QueuewaitRecord, Integer>) super.getIdentity();
    }

    @Override
    public Queuewait as(String alias) {
        return new Queuewait(DSL.name(alias), this);
    }

    @Override
    public Queuewait as(Name alias) {
        return new Queuewait(alias, this);
    }

    @Override
    public Queuewait as(Table<?> alias) {
        return new Queuewait(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Queuewait rename(String name) {
        return new Queuewait(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Queuewait rename(Name name) {
        return new Queuewait(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Queuewait rename(Table<?> name) {
        return new Queuewait(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Integer, String, Boolean, OffsetDateTime, OffsetDateTime, Long, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Integer, ? super String, ? super Boolean, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super Integer, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Integer, ? super String, ? super Boolean, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super Integer, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}