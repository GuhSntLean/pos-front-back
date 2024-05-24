# Project Overview

This project is a Java application that models a travel package system. It includes several classes that represent different aspects of a travel package.

## Classes

### `Cliente`

This class represents a client in the system. It contains a list of `Contratacao` objects.

### `Contratacao`

This class represents a contract in the system. The details of this class are not provided in the context.

### `ItemPacote`

This class represents an item in a travel package. It has a `price` field.

### `LocacaoVeiculo`

This class extends `ItemPacote` and represents a vehicle rental. It has `marca` (brand) and `modelo` (model) fields.

### `Pacote`

This class represents a travel package. It contains a `descricao` (description), a list of `ItemPacote` objects, and a `Localidade` object.

### `Localidade`

This class represents a location in the system. The details of this class are not provided in the context.

### `TransladoAereo`

This class extends `ItemPacote` and represents an air transfer. It has `companhiaAerea` (airline) and `numeroVoo` (flight number) fields.

## Usage

To use this application, create instances of the classes and use the provided getter and setter methods to manipulate the data.

## Note

This README provides a basic overview of the project. For more detailed information, please refer to the comments in the source code.