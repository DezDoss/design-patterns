package com.patterns.edu.creational.absractfactory;

import com.patterns.edu.creational.absractfactory.banking.BankProjectTeamFactory;

public class AbsractFactory {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankProjectTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
