/*
	Copyright (c) 2012 Thomas Zink, 

	This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.fhkn.in.net;

import java.io.IOException;
import java.net.Socket;

/**
 * 
 * @author thomas zink, daniel maier
 */
public interface SocketTaskFactory {
	/**
	 * Returns a task to handle the new connection.
	 * 
	 * @param s
	 *            the socket of the new connection
	 * @return a task to handle the new connection
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	Runnable getTask(Socket s) throws IOException;
}
