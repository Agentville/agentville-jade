/*****************************************************************
JADE - Java Agent DEvelopment Framework is a framework to develop 
multi-agent systems in compliance with the FIPA specifications.
Copyright (C) 2000 CSELT S.p.A. 

GNU Lesser General Public License

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation, 
version 2.1 of the License. 

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library; if not, write to the
Free Software Foundation, Inc., 59 Temple Place - Suite 330,
Boston, MA  02111-1307, USA.
*****************************************************************/

// Created: Jun 8, 2004

package jade.core.migration.ontology;

import jade.content.Concept;

/**
 * Description here
 * 
 * @author <a href="mailto:Joan.Ametller@uab.es">Joan Ametller Esquerra</a>
 * @author Carles Garrigues
 * @author <a href="mailto:Jordi.Cucurull@uab.es">Jordi Cucurull Juan</a>
 * 
 */
public class MobileAgentProfile implements Concept {
  private MobileAgentSystem system;
  private MobileAgentLanguage language;
  private MobileAgentProtocol protocol;

  public void setSystem(MobileAgentSystem s) {
    system = s;
  }

  public MobileAgentSystem getSystem() {
    return system;
  }

  public void setLanguage(MobileAgentLanguage l) {
    language = l;
  }

  public MobileAgentLanguage getLanguage() {
    return language;
  }

  public void setProtocol(MobileAgentProtocol p) {
    protocol = p;
  }

  public MobileAgentProtocol getProtocol() {
    return protocol;
  }

}
