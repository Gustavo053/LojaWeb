// in src/enderecos
import * as React from "react";
import { List, Datagrid, TextField, EmailField, ReferenceInput, SimpleForm, EditButton, Edit, TextInput, NumberInput, Create } from 'react-admin';

export const PedidoList = props => (
    <List {...props}>
        <Datagrid rowClick="edit">
            <TextField source="id" />
            <TextField source="data" />
            <TextField label="cliente" source="cliente.id" />
            <TextField label="Produto" source="produtos.id" />
            <TextField label="Nome do produto" source="produtos.nome" />
            <TextField label="categoria" source="produtos.categoria" />
        </Datagrid>
    </List>
);

export const PedidoEdit = props => (
    <Edit {...props}>
        <SimpleForm>
            <TextInput disable source="id" />
            <TextInput source="data"/>
            <ReferenceInput label="Cliente" source="cliente.nome" />
            <ReferenceInput label="Cliente" source="cliente.email" />
        </SimpleForm>
    </Edit>
);

export const EnderecoCreate = props => (
    <Create {...props}>
        <SimpleForm>
            <TextInput source="bairro" />
            {/*<TextInput source="email" />*/}
        </SimpleForm>
    </Create>
);
