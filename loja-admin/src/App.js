// in src/App.js

import * as React from "react";
import { Admin, Resource } from 'react-admin';
import { EnderecoList, EnderecoCreate, EnderecoEdit } from './enderecos';
import { ClienteList, ClienteCreate, ClienteEdit } from "./cliente";
import jsonServerProvider from 'ra-data-json-server';

const dataProvider = jsonServerProvider('http://localhost:8080');

const App = () => (
    <Admin dataProvider={dataProvider}>
        <Resource name="endereco" list={EnderecoList} />
        <Resource name="cliente" list={ClienteList} />
        {/*<Resource name="Cadastrar endereço" list={EnderecoCreate} />*/}
        {/*<Resource name="Editar endereço" list={EnderecoEdit} />*/}
        {/*<Resource name="Cadastrar cliente" list={ClienteCreate} />*/}
        {/*<Resource name="Editar cliente" list={ClienteEdit} />*/}
    </Admin>
);

export default App;
