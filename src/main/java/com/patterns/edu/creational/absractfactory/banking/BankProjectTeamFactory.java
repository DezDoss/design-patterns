package com.patterns.edu.creational.absractfactory.banking;

import com.patterns.edu.creational.absractfactory.Developer;
import com.patterns.edu.creational.absractfactory.ProjectManager;
import com.patterns.edu.creational.absractfactory.ProjectTeamFactory;
import com.patterns.edu.creational.absractfactory.Tester;

public class BankProjectTeamFactory implements ProjectTeamFactory {
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QATester();
    }

    public ProjectManager getProjectManager() {
        return new BankingProjectManger();
    }
}
