# HelloActions-Ibrahim

## Lab 11: GitHub Actions Workflow

This project demonstrates how to use GitHub Actions to automatically compile and run a simple Java program. The program reads a name from an environment variable and prints a greeting.

## How the Program Works

The Java program uses `System.getenv("WHO_TO_GREET")` to get a name from an environment variable. If the variable is unavailable, the program uses "Student" as the default name.

The program then prints two messages:

```text
Hello GitHub Actions Student!
This program is running inside GitHub Actions.
```

## Understanding GitHub Actions

### 1. What is the purpose of the `on` section?

The `on` section defines when the workflow should run. In this project, the workflow runs automatically when changes are pushed to the main branch. It can also be started manually.

### 2. What does `workflow_dispatch` do?

`workflow_dispatch` allows me to manually start the workflow from the Actions tab on GitHub without having to push new changes.

### 3. What does `runs-on` specify?

`runs-on` specifies the environment where the job will execute. In my workflow, `ubuntu-latest` means GitHub uses an Ubuntu Linux runner to execute the program.

### 4. Why is `actions/checkout` needed?

The checkout action downloads my repository files onto the GitHub Actions runner so that the workflow can access and execute my Java program.

### 5. What does the language setup action do?

The `actions/setup-java` action configures the Java environment on the runner. I used Java 17 with the Temurin distribution so that the runner can compile and execute my program.

### 6. What is the difference between compiling and running the program?

Compiling converts my Java source code into bytecode using `javac Hello.java`. Running the program means executing that compiled bytecode using `java Hello`.

### 7. Where can you see the program output?

I can see the output in the GitHub Actions logs. I open the workflow run, select the Java job, and expand the "Run Java program" step to see the printed messages.

### 8. What is the difference between a workflow, a job, and a step?

A workflow is the complete automation process defined in a YAML file. A job is a group of tasks that runs on a specific runner. A step is an individual action or command within a job.

In my project, the workflow contains one job with four steps: checking out the repository, setting up Java, compiling the program, and running it.

## AI Usage Statement

I used ChatGPT to help me understand the GitHub Actions instructions and guide me through creating the workflow. I reviewed the Java code, workflow configuration, and execution results to understand how each part works.
