/*
 *     Copyright 2016-2026 TinyZ
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ogcs.okra.example.game.persistence.provider;

import org.apache.ibatis.jdbc.SQL;
import org.ogcs.okra.example.game.persistence.domain.MemBusListener;

public final class BusListenerSqlProvider {

    private static final String TABLE_NAME = "tb_bus_listener";

    public String selectSql() {
        return new SQL() {{
            SELECT("*");
            FROM(TABLE_NAME);
            WHERE("uid=#{uid}");
        }}.toString();
    }

    public String selectByEventSql() {
        return new SQL() {{
            SELECT("*");
            FROM(TABLE_NAME);
            WHERE("uid=#{uid} AND event=#{event}");
        }}.toString();
    }

    public String insertSql() {
        return new SQL() {{
            INSERT_INTO(TABLE_NAME);
            VALUES("uid", "#{uid}");
            VALUES("event", "#{event}");
            VALUES("busId", "#{busId}");
        }}.toString();
    }

    public String deleteSql() {
        return new SQL() {{
            DELETE_FROM(TABLE_NAME);
            WHERE("uid=#{uid} AND event=#{event}");
        }}.toString();
    }
}
