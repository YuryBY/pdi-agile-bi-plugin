/*!
* This program is free software; you can redistribute it and/or modify it under the
* terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
* Foundation.
*
* You should have received a copy of the GNU Lesser General Public License along with this
* program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
* or from the Free Software Foundation, Inc.,
* 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
* without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
* See the GNU Lesser General Public License for more details.
*
* Copyright (c) 2002-2013 Pentaho Corporation..  All rights reserved.
*/

package org.pentaho.agilebi.debug;

import org.pentaho.agilebi.modeler.ModelerException;
import org.pentaho.agilebi.modeler.ModelerMessagesHolder;
import org.pentaho.agilebi.modeler.ModelerWorkspace;
import org.pentaho.agilebi.spoon.SpoonModelerMessages;
import org.pentaho.agilebi.spoon.SpoonModelerWorkspaceHelper;
import org.pentaho.agilebi.spoon.XulUI;

public class DebugXulUI {

  public static void main(String[] args){
    try {
      ModelerMessagesHolder.setMessages(new SpoonModelerMessages());
      new XulUI(null, new ModelerWorkspace(new SpoonModelerWorkspaceHelper())).startDebugWindow();
    } catch (ModelerException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
}
