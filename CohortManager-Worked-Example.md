# CohortManager Domain Model

## User Story

```
As a user,
So I can find a specific cohort,
I want to search a list of all cohorts by a cohort name.
```

As a developer, it's our job to extract the useful information into a functional system. Look for nouns and verbs; nouns usually describe entities, verbs usually describe methods.

Here is how one might design a domain model for the above user story:

| Classes         | Methods               | Scenario               | Outputs |
|-----------------|-----------------------|------------------------|---------|
| `CohortManager` | `search(String name)` | If name is in list     | true    |
|                 |                       | If name is not in list | false   |

In this model the CohortManager manages the list of cohorts and takes an ArrayList of strings as an argument to its constructor.

We're going to start by creating an ArrayList of names and passing it to the constructor in the Test file. This is part of the setup and we'll use this for a number of our tests. We could also instantiate a new object inside each test method and use it. There are positives and negatives with each solution.

Then for our first test we'll write one that checks whether a given name is found by the search() method and assert that it should be true for the name we're looking for.

When we first run the test it will throw an error as we won't have defined the search() method at that point. To fix that we'll create a search() method and to make the test pass we'll get it to return true, no matter what we're searching for.

Then we'll add a second test to check that when searching for a term that isn't in the known list we get a false value returned. When that test fails then we add code to the search to make sure that both tests pass.

Ideally once we have a test that is passing we do not want to change it, that way as long as it continues to pass we know that any future changes we make to our code in theory haven't affected this functionality.

