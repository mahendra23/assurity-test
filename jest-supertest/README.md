## Overview

This project is a Typescript based testing framework that uses Jest and Supertest for API testing. The project is set up as a node project, which helps in managing dependencies and building the project.

### Key Components:
- **Supertest**: A node package for testing and validating REST APIs.
- **Jest**: A delightful JavaScript Testing Framework with a focus on simplicity.

### Project Structure:
```
assurity-test/
├── jest-supertest/
│   ├── __tests__/
│   │   ├── integration/
│   │   └── unit/
│   ├── src/
│   │   ├── controllers/
│   │   ├── models/
│   │   └── services/
│   ├── package.json
│   └── README.md
```

## Prerequisites

- Node.js (>= 14.x)
- npm (>= 6.x) or yarn (>= 1.x)

## Installation
To install the necessary dependencies, run the following command:
```bash
npm install
```

## Usage
To run the tests, use the following command:
```bash
npm test
```
