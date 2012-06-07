/**
 * Copyright (C) 2011 Angelo Zerr <angelo.zerr@gmail.com> and Pascal Leclercq <pascal.leclercq@gmail.com>
 *
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package fr.opensagres.xdocreport.remoting.resources.services.rest;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class to hold JAXRS Providers config
 *
 * @author <a href="mailto:tdelprat@nuxeo.com">Tiry</a>
 */
public class Providers
{

    protected static List<Object> providers = null;

    public static synchronized List<Object> get()
    {
        if ( providers == null )
        {
            providers = new ArrayList<Object>();
            providers.add( new BinaryDataMessageBodyReader() );
            providers.add( new BinaryDataMessageBodyWriter() );
            providers.add( new LargeBinaryDataMessageBodyReader() );
            providers.add( new LargeBinaryDataMessageBodyWriter() );
        }
        return providers;
    }
}
