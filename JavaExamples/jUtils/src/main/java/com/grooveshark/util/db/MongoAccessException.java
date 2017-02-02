/**
 *                  GNU GENERAL PUBLIC LICENSE
 *
 *  Copyright (C) 2012 Anandan.
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package com.grooveshark.util.db;

import com.mongodb.MongoException;
import org.bson.BSONObject;

/**
 * Exception to be thrown, when there is any discrepancies in
 * {@link MongoAccess}
 *
 * @author andy.compeer@gmail.com
 */

public class MongoAccessException extends MongoException {


    private static final long serialVersionUID = 7526472295622776147L;

    /**
     * Override all Constructors in {@link com.mongodb.MongoException}
     */

    public MongoAccessException(BSONObject bson) {
        super(bson);
    }

    public MongoAccessException(String msg) {
        super(msg);
    }

    public MongoAccessException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public MongoAccessException(int code, String msg) {
        super(code, msg);
    }

    public MongoAccessException(int code, String msg, Throwable cause) {
        super(code, msg, cause);
    }


}
