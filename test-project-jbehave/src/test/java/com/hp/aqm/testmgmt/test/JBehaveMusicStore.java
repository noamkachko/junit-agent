package com.hp.aqm.testmgmt.test;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: arnaudc
 * Date: 13-8-27
 * Time: 下午3:58
 * To change this template use File | Settings | File Templates.
 */
public class JBehaveMusicStore extends JUnitStories {

    public static class ExampleSteps {
        @Given("user enters music search tab")
        public void enterMusicTab() {
            System.out.println("precondition");
        }

        @When("user press recommendation button")
        public void recommendationSearch() {
            System.out.println("occurrence");
        }

        @Then("recommendation list is opened")
        public void recommendationList() {
            System.out.println("outcome");
        }



        @Then("song is presented in the grid")
        public void validateSongExist() {
            System.out.println("outcome");
        }

        @When("search song by artist first name")
        public void searchFirstName() {
            System.out.println("outcome");
        }

        @When("search song by artist last name")
        public void searchLast() {
            System.out.println("outcome");
        }
    }

    @Override
    protected List<String> storyPaths() {
        return Arrays.asList("com/hp/aqm/testmgmt/test/j_behave_music_store.story");
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new ExampleSteps());
    }
}
