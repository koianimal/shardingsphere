/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.infra.executor.sql.execute.result.query;

import org.apache.shardingsphere.infra.executor.sql.execute.result.ExecuteResult;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.Calendar;

/**
 * Query result.
 */
public interface QueryResult extends ExecuteResult {
    
    /**
     * Iterate next data.
     *
     * @return has next data
     * @throws SQLException SQL Exception
     */
    boolean next() throws SQLException;
    
    /**
     * Get data value.
     *
     * @param columnIndex column index
     * @param type class type of data value
     * @return data value
     * @throws SQLException SQL Exception
     */
    Object getValue(int columnIndex, Class<?> type) throws SQLException;
    
    /**
     * Get calendar value.
     *
     * @param columnIndex column index
     * @param type class type of data value
     * @param calendar calendar
     * @return calendar value
     * @throws SQLException SQL Exception
     */
    Object getCalendarValue(int columnIndex, Class<?> type, Calendar calendar) throws SQLException;
    
    /**
     * Get input stream.
     *
     * @param columnIndex column index
     * @param type class type of data value
     * @return input stream
     * @throws SQLException SQL Exception
     */
    InputStream getInputStream(int columnIndex, String type) throws SQLException;
    
    /**
     * Judge result set is null or not.
     *
     * @return result set is null or not
     * @throws SQLException SQL Exception
     */
    boolean wasNull() throws SQLException;
    
    /**
     * Get column count.
     *
     * @return column count
     * @throws SQLException SQL Exception
     */
    int getColumnCount() throws SQLException;
    
    /**
     * Get table name.
     *
     * @param columnIndex column index
     * @return table name
     * @throws SQLException SQL Exception
     */
    String getTableName(int columnIndex) throws SQLException;
    
    /**
     * Get column name.
     *
     * @param columnIndex column index
     * @return column name
     * @throws SQLException SQL Exception
     */
    String getColumnName(int columnIndex) throws SQLException;
    
    /**
     * Get column label.
     *
     * @param columnIndex column index
     * @return column label
     * @throws SQLException SQL Exception
     */
    String getColumnLabel(int columnIndex) throws SQLException;
    
    /**
     * Get column type.
     *
     * @param columnIndex column index
     * @return column type
     * @throws SQLException SQL Exception
     */
    int getColumnType(int columnIndex) throws SQLException;
    
    /**
     * Get column type name.
     *
     * @param columnIndex column index
     * @return column type name
     * @throws SQLException SQL Exception
     */
    String getColumnTypeName(int columnIndex) throws SQLException;
    
    /**
     * Get column length.
     *
     * @param columnIndex column index
     * @return column length
     * @throws SQLException SQL Exception
     */
    int getColumnLength(int columnIndex) throws SQLException;
    
    /**
     * Get decimals.
     *
     * @param columnIndex column index
     * @return decimals
     * @throws SQLException SQL Exception
     */
    int getDecimals(int columnIndex) throws SQLException;
    
    /**
     * Is signed.
     *
     * @param columnIndex column index
     * @return signed or not
     * @throws SQLException SQL Exception
     */
    boolean isSigned(int columnIndex) throws SQLException;
    
    /**
     * Is not null.
     *
     * @param columnIndex column index
     * @return not null or null
     * @throws SQLException SQL Exception
     */
    boolean isNotNull(int columnIndex) throws SQLException;
    
    /**
     * Is auto increment.
     *
     * @param columnIndex column index
     * @return auto increment or not
     * @throws SQLException SQL Exception
     */
    boolean isAutoIncrement(int columnIndex) throws SQLException;
}
