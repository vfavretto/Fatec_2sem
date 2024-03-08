export interface IDefaultService<Payload, ServicesReturn = any> {
  create: (data: Payload) => Promise<ServicesReturn>;
  update: (id: number, data: Partial<Payload>) => Promise<ServicesReturn>;
  getAll: () => Promise<ServicesReturn>;
  delete: (id: number) => Promise<ServicesReturn>;
}
