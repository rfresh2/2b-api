/*
 * This file is generated by jOOQ.
 */
package vc.data.dto.tables.records;


import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;
import vc.data.dto.tables.PlaytimeAllTimeInterval;

import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PlaytimeAllTimeIntervalRecord extends TableRecordImpl<PlaytimeAllTimeIntervalRecord> implements Record3<UUID, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.playtime_all_time_interval.p_uuid</code>.
     */
    public PlaytimeAllTimeIntervalRecord setPUuid(UUID value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.playtime_all_time_interval.p_uuid</code>.
     */
    public UUID getPUuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>public.playtime_all_time_interval.playtime</code>.
     */
    public PlaytimeAllTimeIntervalRecord setPlaytime(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.playtime_all_time_interval.playtime</code>.
     */
    public Integer getPlaytime() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.playtime_all_time_interval.p_name</code>.
     */
    public PlaytimeAllTimeIntervalRecord setPName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.playtime_all_time_interval.p_name</code>.
     */
    public String getPName() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<UUID, Integer, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<UUID, Integer, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return PlaytimeAllTimeInterval.PLAYTIME_ALL_TIME_INTERVAL.P_UUID;
    }

    @Override
    public Field<Integer> field2() {
        return PlaytimeAllTimeInterval.PLAYTIME_ALL_TIME_INTERVAL.PLAYTIME;
    }

    @Override
    public Field<String> field3() {
        return PlaytimeAllTimeInterval.PLAYTIME_ALL_TIME_INTERVAL.P_NAME;
    }

    @Override
    public UUID component1() {
        return getPUuid();
    }

    @Override
    public Integer component2() {
        return getPlaytime();
    }

    @Override
    public String component3() {
        return getPName();
    }

    @Override
    public UUID value1() {
        return getPUuid();
    }

    @Override
    public Integer value2() {
        return getPlaytime();
    }

    @Override
    public String value3() {
        return getPName();
    }

    @Override
    public PlaytimeAllTimeIntervalRecord value1(UUID value) {
        setPUuid(value);
        return this;
    }

    @Override
    public PlaytimeAllTimeIntervalRecord value2(Integer value) {
        setPlaytime(value);
        return this;
    }

    @Override
    public PlaytimeAllTimeIntervalRecord value3(String value) {
        setPName(value);
        return this;
    }

    @Override
    public PlaytimeAllTimeIntervalRecord values(UUID value1, Integer value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlaytimeAllTimeIntervalRecord
     */
    public PlaytimeAllTimeIntervalRecord() {
        super(PlaytimeAllTimeInterval.PLAYTIME_ALL_TIME_INTERVAL);
    }

    /**
     * Create a detached, initialised PlaytimeAllTimeIntervalRecord
     */
    public PlaytimeAllTimeIntervalRecord(UUID pUuid, Integer playtime, String pName) {
        super(PlaytimeAllTimeInterval.PLAYTIME_ALL_TIME_INTERVAL);

        setPUuid(pUuid);
        setPlaytime(playtime);
        setPName(pName);
    }

    /**
     * Create a detached, initialised PlaytimeAllTimeIntervalRecord
     */
    public PlaytimeAllTimeIntervalRecord(vc.data.dto.tables.pojos.PlaytimeAllTimeInterval value) {
        super(PlaytimeAllTimeInterval.PLAYTIME_ALL_TIME_INTERVAL);

        if (value != null) {
            setPUuid(value.getPUuid());
            setPlaytime(value.getPlaytime());
            setPName(value.getPName());
        }
    }
}