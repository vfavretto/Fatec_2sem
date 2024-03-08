import { IDefaultService } from "./defaultService.interface";

export interface IUserService<Payload, ServicesReturn = any>
  extends IDefaultService<Payload, ServicesReturn> {
    getByEmail: (email: string) => Promise<ServicesReturn>
  }
 