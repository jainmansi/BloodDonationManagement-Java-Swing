/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.*;
import Business.Role.*;
import Business.UserAccount.UserAccount;
import UserInterface.ReceptionistRole.ReceptionistWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class ReceptionistRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel pnl, UserAccount ua, Organization o, Enterprise e, EcoSystem es) {
        return new ReceptionistWorkAreaJPanel(pnl, ua, (ReceptionistOrganization)o, e);
    }
    
}
